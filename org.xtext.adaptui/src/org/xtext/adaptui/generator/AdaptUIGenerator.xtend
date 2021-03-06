/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.adaptui.adaptUI.Model
import org.xtext.adaptui.adaptUI.AdaptationRule
import org.xtext.adaptui.adaptUI.ConditionalOrExpression
import org.xtext.adaptui.adaptUI.impl.ConditionalOrExpressionImpl
import org.xtext.adaptui.adaptUI.ConditionalPrimary
import org.xtext.adaptui.adaptUI.ConditionalAndExpression
import org.xtext.adaptui.adaptUI.StringCondition
import org.xtext.adaptui.adaptUI.BooleanCondition
import org.xtext.adaptui.adaptUI.NumberCondition
import org.xtext.adaptui.adaptUI.Actions
import org.xtext.adaptui.adaptUI.ActionCategory
import org.xtext.adaptui.adaptUI.ParentOperation
import org.xtext.adaptui.adaptUI.impl.ServiceFunctionCallOperationImpl
import org.xtext.adaptui.adaptUI.ServiceFunctionCallOperation
import org.xtext.adaptui.adaptUI.EditFactOperation
import org.xtext.adaptui.adaptUI.AddViewComponentOperation
import org.xtext.adaptui.adaptUI.DeleteNavLinkOperation
import org.xtext.adaptui.adaptUI.AddNavLinkOperation
import org.xtext.adaptui.adaptUI.DeleteViewComponentOperation
import org.xtext.adaptui.adaptUI.RedirectNavLinkOperation
import org.xtext.adaptui.adaptUI.ClearNavOperation
import org.xtext.adaptui.adaptUI.ChangeFontOperation
import org.xtext.adaptui.adaptUI.ChangeFontSizeOperation
import org.xtext.adaptui.adaptUI.ChangeTableCssClassOperation
import org.xtext.adaptui.adaptUI.AdaptCssClassOperation
import org.xtext.adaptui.adaptUI.ChangeColorSchemeOperation
import org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation
import org.xtext.adaptui.adaptUI.impl.AddNavLinkOperationImpl
import org.xtext.adaptui.adaptUI.ServiceList
import org.xtext.adaptui.adaptUI.Service
import org.xtext.adaptui.adaptUI.FunctionList
import org.xtext.adaptui.adaptUI.Function
import org.xtext.adaptui.adaptUI.StringValue
import org.xtext.adaptui.adaptUI.IntValue
import org.xtext.adaptui.adaptUI.BoolValue
import org.xtext.adaptui.adaptUI.AdaptationRule
import org.xtext.adaptui.adaptUI.Entity
import org.xtext.adaptui.adaptUI.Property
import org.xtext.adaptui.adaptUI.Provider
import org.xtext.adaptui.adaptUI.DefTypes
import org.xtext.adaptui.adaptUI.DefType
import org.xtext.adaptui.adaptUI.Enums
import org.xtext.adaptui.adaptUI.UpdateType
import org.xtext.adaptui.adaptUI.TYPE
import org.xtext.adaptui.adaptUI.Fact
import org.xtext.adaptui.adaptUI.FactProperty

/**
 * Copy the code from AdaptUIGenerator2.xtend here without indentation
 * 
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AdaptUIGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	    for (e : resource.allContents.toIterable.filter(Model)) {
	        fsa.generateFile(
	            "adaptUI" + ".xml",
	            e.compile)
	    }
	}
	
	def compile(Model model)'''<?xml version="1.0" encoding="ASCII"?><adaptUIModel xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><contextModel>�FOR entity: model.contextModel.entity��entity.compile��ENDFOR��IF model.contextModel.provider !== null�<providers>�FOR prov: model.contextModel.provider��prov.compile��ENDFOR�</providers>�ENDIF��IF model.contextModel.types !== null�<defTypes>�model.contextModel.types.compile�</defTypes>�ENDIF�</contextModel><adaptationModel>�IF model.adaptationModel.services !== null�<services>�model.adaptationModel.services.compile�</services>�ENDIF�<flow name="�model.adaptationModel.flowName�">�FOR rule: model.adaptationModel.adaptationRules��rule.compile��ENDFOR�</flow></adaptationModel></adaptUIModel>'''
	
	def compile(Entity entity)'''<entity name="�entity.name�">�FOR prop: entity.property��prop.compile��ENDFOR�</entity>'''

	def compile(Property prop)'''<property name="�prop.name�" type="�prop.type.getType�" provider="�prop.provider.name�" update="�prop.update.getUpdateType�"/>'''
	
	def getType(TYPE type){
		if(type.string !== null){
			return type.string;
		}else if(type.number !== null){
			return type.number;
		}else if(type.boolean !== null){
			return type.boolean;
		}else {
			return type.deftype.name;
		}
	}
	
	def getUpdateType(UpdateType update){
		if(update.event !== null){
			return update.event;
		}else if(update.slow !== null){
			return update.slow;
		}else{
			return update.fast;
		}
	}
	
	def compile(Provider prov)'''<provider name="�prov.name�"/>'''
	
	def compile(DefTypes dtypes)'''�IF dtypes.this !== null��dtypes.this.compile��ENDIF��IF dtypes.next !== null��dtypes.next.compile��ENDIF�'''
	
	def compile(DefType dtype)'''<defType name="�dtype.name�">�IF dtype.enums !== null��dtype.enums.compile��ENDIF�</defType>'''
	
	def compile(Enums enus)'''�IF enus.this !== null�<enum name="�enus.this.name�"/>�ENDIF��IF enus.next !== null��enus.next.compile��ENDIF�'''
	
	def compile(ServiceList slist)'''�IF slist.this !== null��slist.this.compile��ENDIF��IF slist.next !== null��slist.next.compile��ENDIF�'''
	
	def compile(Service svc)'''<service id="�svc.id�" type="�svc.type�" location="�svc.loc�">�svc.functions.compile�</service>'''
	
	def compile(FunctionList flist)'''�IF flist.this !== null��flist.this.compile��ENDIF��IF flist.next !== null��flist.next.compile��ENDIF�'''
	
	def compile(Function func)'''<function id="�func.id�" name="�func.name�" />'''
	
	def compile(AdaptationRule rule) '''<adaptationRule name="�rule.name�" priority="�rule.level�" factType="�rule.factType�" factName="�rule.factName.name�"><conditions>�rule.expr.compile�</conditions><actions>�rule.actionCollection.compile�</actions></adaptationRule>'''
	
	def compile(Actions act)'''�act.action.compile��IF act.next !== null��act.next.compile��ENDIF�'''

	def compile(ActionCategory cat)'''�cat.actionCategory.compile�'''
	
	def compile(ParentOperation pop){
		var op = pop.operation
		switch (op) {
			ServiceFunctionCallOperation: {
				'''<functionCall service="�(op as ServiceFunctionCallOperation).service�" function="�(op as ServiceFunctionCallOperation).function�" value=�(op as ServiceFunctionCallOperation).^val�/>'''
			}
			EditFactOperation: {
				'''<editFactOperation set="�(op as EditFactOperation).prop.compile�" �IF (op as EditFactOperation).^val !== null�value="�(op as EditFactOperation).^val�"�ENDIF�/>'''
			}
			SetDisplayPropertyOperation: {
				switch ((op as SetDisplayPropertyOperation).propertyValue.propertyClass){
					StringValue: {
						'''<setDisplayProperty property="�(op as SetDisplayPropertyOperation).property�" value="�((op as SetDisplayPropertyOperation).propertyValue.propertyClass as StringValue).value�"/>'''
					}
					IntValue:{
						'''<setDisplayProperty property="�(op as SetDisplayPropertyOperation).property�" value="�((op as SetDisplayPropertyOperation).propertyValue.propertyClass as IntValue).value�"/>'''
					}
					BoolValue: {
						'''<setDisplayProperty property="�(op as SetDisplayPropertyOperation).property�" value="�((op as SetDisplayPropertyOperation).propertyValue.propertyClass as BoolValue).value�" type="boolean"/>'''
					}
					default:{
						'''<setDisplayProperty property="�(op as SetDisplayPropertyOperation).property�" value="�(op as SetDisplayPropertyOperation)�"/>'''
					}
				}
			}
			AddViewComponentOperation: {
				'''<addViewComponentOperation viewComponent="�(op as AddViewComponentOperation).viewComp�" target="�(op as AddViewComponentOperation).target�"/>'''
			}
			DeleteViewComponentOperation: {
				'''<deleteViewComponentOperation viewComponent="�(op as DeleteViewComponentOperation).viewComp�"/>'''
			}
			AddNavLinkOperationImpl: {
				'''<addNavLinkOperation viewContainer="�(op as AddNavLinkOperation).viewComp�" langKey=�(op as AddNavLinkOperation).text�/>'''
			}
			DeleteNavLinkOperation: {
				'''<deleteNavLinkOperation viewContainer="�(op as DeleteNavLinkOperation).viewComp�" />'''
			}
			RedirectNavLinkOperation: {
				'''<redirectNavLinkOperation viewContainer="�(op as RedirectNavLinkOperation).viewComp�" />'''
			}
			ClearNavOperation: {
				'''<clearNavOperation/>'''
			}
			ChangeFontOperation: {
				
			}
			ChangeFontSizeOperation: {
				
			}
			ChangeTableCssClassOperation: {
				
			}
			AdaptCssClassOperation: {
				'''<editCssClassOperation cssClass=�(op as AdaptCssClassOperation).cssClass� cssAttribute=�(op as AdaptCssClassOperation).cssAttribute� value=�(op as AdaptCssClassOperation).cssAttributeValue�/>'''
			}
			ChangeColorSchemeOperation: {
				
			}
			default: {
				println("ERROR: unknown operation")
				'''<!--ERROR: unknown operation-->'''
			}
		}
	}
	
	def compile(FactProperty factProp)'''�factProp.factName.name�.get�factProp.entity.name�().set�factProp.propertyName�(�factProp.value�)'''
	
	def compile(ConditionalOrExpression expr) '''�IF expr.left !== null��/*Binding Group*/IF expr.left.left !== null && expr.left.right !== null�<conditionGroup>�expr.left.compile�</conditionGroup>�ENDIF��/*OR*/IF expr.left.left !== null && expr.left.right === null��expr.left.left.compile��ENDIF��ENDIF��IF expr.right !== null��expr.right.compile��ENDIF�'''
	
	def compile(ConditionalAndExpression expr)'''�IF expr.left !== null��expr.left.compile��ENDIF��IF expr.right !== null��expr.right.compile��ENDIF�'''

	def compile(ConditionalPrimary expr)'''�IF expr.cond instanceof BooleanCondition��(expr.cond as BooleanCondition).compile��ENDIF��IF expr.cond instanceof NumberCondition��(expr.cond as NumberCondition).compile��ENDIF��IF expr.cond instanceof StringCondition��(expr.cond as StringCondition).compile��ENDIF�'''

	def compile(BooleanCondition cond)'''<condition fact="�cond.fact.compile�" �IF (cond.op !== null)�operator="�getOperator(cond.op)�"�ENDIF� �IF cond.^val !== null�value="�cond.^val.replace("'","")�"�ENDIF� type="boolean"/>'''
	
	def compile(StringCondition cond)'''<condition fact="�cond.fact.compile�" �IF (cond.op !== null)�operator="�getOperator(cond.op)�"�ENDIF� �IF cond.^val !== null�value="�cond.^val.replace("'","")�"�ENDIF� type="string"/>'''
	
	def compile(NumberCondition cond)'''<condition fact="�cond.fact.compile�" �IF (cond.op !== null)�operator="�getOperator(cond.op)�"�ENDIF� value="�cond.^val�" type="number"/>'''

	def compile(Fact fact)'''�fact.factName.name�.get�fact.entity.name�().get�fact.propertyName�()'''
	
	def getOperator(String op){
		switch (op) {
			case "<=": {
				return "lte";
			}
			case ">=": {
				return "gte";
			}
			case "<": {
				return "lt";
			}
			case ">": {
				return "gt";
			}
			default: {
				return op;
			}
		}
	}
}

