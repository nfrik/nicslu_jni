package wrapper;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nicslu_readfileJNI {
  public final static native int ROW_LENGTH_get();
  public final static native int ReadHeader3(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native int ReadHeader2(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native int NicsLU_ReadTripletColumnToSparse(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native int NicsLU_ReadTripletRowToSparse(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
}
