/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class doubleArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected doubleArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(doubleArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        nicsluJNI.delete_doubleArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public doubleArray(int nelements) {
    this(nicsluJNI.new_doubleArray(nelements), true);
  }

  public double getitem(int index) { return nicsluJNI.doubleArray_getitem(swigCPtr, this, index); }

  public void setitem(int index, double value) {
    nicsluJNI.doubleArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_real__t cast() {
    long cPtr = nicsluJNI.doubleArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public static doubleArray frompointer(SWIGTYPE_p_real__t t) {
    long cPtr = nicsluJNI.doubleArray_frompointer(SWIGTYPE_p_real__t.getCPtr(t));
    return (cPtr == 0) ? null : new doubleArray(cPtr, false);
  }

}
