package wrapper;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class nicslu_readfile implements nicslu_readfileConstants {
  public static int ReadHeader3(SWIGTYPE_p_FILE f, SWIGTYPE_p_uint__t m, SWIGTYPE_p_uint__t n, SWIGTYPE_p_uint__t nnz) {
    return nicslu_readfileJNI.ReadHeader3(SWIGTYPE_p_FILE.getCPtr(f), SWIGTYPE_p_uint__t.getCPtr(m), SWIGTYPE_p_uint__t.getCPtr(n), SWIGTYPE_p_uint__t.getCPtr(nnz));
  }

  public static int ReadHeader2(SWIGTYPE_p_FILE f, SWIGTYPE_p_uint__t m, SWIGTYPE_p_uint__t n, SWIGTYPE_p_uint__t nnz) {
    return nicslu_readfileJNI.ReadHeader2(SWIGTYPE_p_FILE.getCPtr(f), SWIGTYPE_p_uint__t.getCPtr(m), SWIGTYPE_p_uint__t.getCPtr(n), SWIGTYPE_p_uint__t.getCPtr(nnz));
  }

  public static int NicsLU_ReadTripletColumnToSparse(String file, SWIGTYPE_p_uint__t n, SWIGTYPE_p_uint__t nnz, SWIGTYPE_p_p_real__t ax, SWIGTYPE_p_p_uint__t ai, SWIGTYPE_p_p_uint__t ap) {
    return nicslu_readfileJNI.NicsLU_ReadTripletColumnToSparse(file, SWIGTYPE_p_uint__t.getCPtr(n), SWIGTYPE_p_uint__t.getCPtr(nnz), SWIGTYPE_p_p_real__t.getCPtr(ax), SWIGTYPE_p_p_uint__t.getCPtr(ai), SWIGTYPE_p_p_uint__t.getCPtr(ap));
  }

  public static int NicsLU_ReadTripletRowToSparse(String file, SWIGTYPE_p_uint__t n, SWIGTYPE_p_uint__t nnz, SWIGTYPE_p_p_real__t ax, SWIGTYPE_p_p_uint__t ai, SWIGTYPE_p_p_uint__t ap) {
    return nicslu_readfileJNI.NicsLU_ReadTripletRowToSparse(file, SWIGTYPE_p_uint__t.getCPtr(n), SWIGTYPE_p_uint__t.getCPtr(nnz), SWIGTYPE_p_p_real__t.getCPtr(ax), SWIGTYPE_p_p_uint__t.getCPtr(ai), SWIGTYPE_p_p_uint__t.getCPtr(ap));
  }

}
