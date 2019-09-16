// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrSimpleTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrSimpleType)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 1;</code>
   */
  boolean hasAnnotations();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.Annotations getAnnotations();

  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol classifier = 2;</code>
   */
  boolean hasClassifier();
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol classifier = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbol getClassifier();

  /**
   * <code>required bool has_question_mark = 3;</code>
   */
  boolean hasHasQuestionMark();
  /**
   * <code>required bool has_question_mark = 3;</code>
   */
  boolean getHasQuestionMark();

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument argument = 4;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument> 
      getArgumentList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument argument = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument getArgument(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeArgument argument = 4;</code>
   */
  int getArgumentCount();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAbbreviation abbreviation = 5;</code>
   */
  boolean hasAbbreviation();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAbbreviation abbreviation = 5;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeAbbreviation getAbbreviation();
}