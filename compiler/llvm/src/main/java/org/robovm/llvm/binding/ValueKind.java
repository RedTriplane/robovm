/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.llvm.binding;

public enum ValueKind {
  ArgumentValueKind,
  BasicBlockValueKind,
  MemoryUseValueKind,
  MemoryDefValueKind,
  MemoryPhiValueKind,
  FunctionValueKind,
  GlobalAliasValueKind,
  GlobalIFuncValueKind,
  GlobalVariableValueKind,
  BlockAddressValueKind,
  ConstantExprValueKind,
  ConstantArrayValueKind,
  ConstantStructValueKind,
  ConstantVectorValueKind,
  UndefValueValueKind,
  ConstantAggregateZeroValueKind,
  ConstantDataArrayValueKind,
  ConstantDataVectorValueKind,
  ConstantIntValueKind,
  ConstantFPValueKind,
  ConstantPointerNullValueKind,
  ConstantTokenNoneValueKind,
  MetadataAsValueValueKind,
  InlineAsmValueKind,
  InstructionValueKind;

  public final int swigValue() {
    return swigValue;
  }

  public static ValueKind swigToEnum(int swigValue) {
    ValueKind[] swigValues = ValueKind.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ValueKind swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ValueKind.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ValueKind() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ValueKind(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ValueKind(ValueKind swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
