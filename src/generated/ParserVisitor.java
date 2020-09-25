// Generated from C:/Users/Baxi/Desktop/Compiladores\Parser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(Parser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(Parser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Parser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(Parser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(Parser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(Parser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(Parser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(Parser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(Parser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(Parser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(Parser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Parser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(Parser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(Parser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(Parser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(Parser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(Parser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Parser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(Parser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(Parser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(Parser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(Parser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(Parser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(Parser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(Parser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(Parser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Parser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Parser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(Parser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(Parser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(Parser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(Parser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(Parser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(Parser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(Parser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(Parser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(Parser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(Parser.ArgumentsContext ctx);
}