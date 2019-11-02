package wrapper;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SNicsLU {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SNicsLU(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SNicsLU obj) {
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
        nicsluJNI.delete_SNicsLU(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFlag(SWIGTYPE_p_bool__t value) {
    nicsluJNI.SNicsLU_flag_set(swigCPtr, this, SWIGTYPE_p_bool__t.getCPtr(value));
  }

  public SWIGTYPE_p_bool__t getFlag() {
    long cPtr = nicsluJNI.SNicsLU_flag_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool__t(cPtr, false);
  }

  public void setStat(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_stat_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getStat() {
    long cPtr = nicsluJNI.SNicsLU_stat_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setCfgi(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_cfgi_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getCfgi() {
    long cPtr = nicsluJNI.SNicsLU_cfgi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setCfgf(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_cfgf_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getCfgf() {
    long cPtr = nicsluJNI.SNicsLU_cfgf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setN(int value) {
    nicsluJNI.SNicsLU_n_set(swigCPtr, this, value);
  }

  public int getN() { return nicsluJNI.SNicsLU_n_get(swigCPtr, this); }

  public void setNnz(int value) {
    nicsluJNI.SNicsLU_nnz_set(swigCPtr, this, value);
  }

  public int getNnz() { return nicsluJNI.SNicsLU_nnz_get(swigCPtr, this); }

  public void setAx(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_ax_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getAx() {
    long cPtr = nicsluJNI.SNicsLU_ax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setAi(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_ai_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAi() {
    long cPtr = nicsluJNI.SNicsLU_ai_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setAp(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_ap_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAp() {
    long cPtr = nicsluJNI.SNicsLU_ap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setRhs(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_rhs_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getRhs() {
    long cPtr = nicsluJNI.SNicsLU_rhs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setRow_perm(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_row_perm_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getRow_perm() {
    long cPtr = nicsluJNI.SNicsLU_row_perm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setRow_perm_inv(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_row_perm_inv_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getRow_perm_inv() {
    long cPtr = nicsluJNI.SNicsLU_row_perm_inv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setCol_perm(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_col_perm_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getCol_perm() {
    long cPtr = nicsluJNI.SNicsLU_col_perm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setCol_perm_inv(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_col_perm_inv_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getCol_perm_inv() {
    long cPtr = nicsluJNI.SNicsLU_col_perm_inv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setCol_scale_perm(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_col_scale_perm_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getCol_scale_perm() {
    long cPtr = nicsluJNI.SNicsLU_col_scale_perm_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setRow_scale(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_row_scale_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getRow_scale() {
    long cPtr = nicsluJNI.SNicsLU_row_scale_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setCscale(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_cscale_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getCscale() {
    long cPtr = nicsluJNI.SNicsLU_cscale_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setPivot(SWIGTYPE_p_int__t value) {
    nicsluJNI.SNicsLU_pivot_set(swigCPtr, this, SWIGTYPE_p_int__t.getCPtr(value));
  }

  public SWIGTYPE_p_int__t getPivot() {
    long cPtr = nicsluJNI.SNicsLU_pivot_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int__t(cPtr, false);
  }

  public void setPivot_inv(SWIGTYPE_p_int__t value) {
    nicsluJNI.SNicsLU_pivot_inv_set(swigCPtr, this, SWIGTYPE_p_int__t.getCPtr(value));
  }

  public SWIGTYPE_p_int__t getPivot_inv() {
    long cPtr = nicsluJNI.SNicsLU_pivot_inv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int__t(cPtr, false);
  }

  public void setLu_nnz_est(long value) {
    nicsluJNI.SNicsLU_lu_nnz_est_set(swigCPtr, this, value);
  }

  public long getLu_nnz_est() {
    return nicsluJNI.SNicsLU_lu_nnz_est_get(swigCPtr, this);
  }

  public void setLu_nnz(long value) {
    nicsluJNI.SNicsLU_lu_nnz_set(swigCPtr, this, value);
  }

  public long getLu_nnz() {
    return nicsluJNI.SNicsLU_lu_nnz_get(swigCPtr, this);
  }

  public void setL_nnz(long value) {
    nicsluJNI.SNicsLU_l_nnz_set(swigCPtr, this, value);
  }

  public long getL_nnz() {
    return nicsluJNI.SNicsLU_l_nnz_get(swigCPtr, this);
  }

  public void setU_nnz(long value) {
    nicsluJNI.SNicsLU_u_nnz_set(swigCPtr, this, value);
  }

  public long getU_nnz() {
    return nicsluJNI.SNicsLU_u_nnz_get(swigCPtr, this);
  }

  public void setLdiag(SWIGTYPE_p_real__t value) {
    nicsluJNI.SNicsLU_ldiag_set(swigCPtr, this, SWIGTYPE_p_real__t.getCPtr(value));
  }

  public SWIGTYPE_p_real__t getLdiag() {
    long cPtr = nicsluJNI.SNicsLU_ldiag_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_real__t(cPtr, false);
  }

  public void setLu_array(SWIGTYPE_p_void value) {
    nicsluJNI.SNicsLU_lu_array_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getLu_array() {
    long cPtr = nicsluJNI.SNicsLU_lu_array_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setUp(SWIGTYPE_p_size_t value) {
    nicsluJNI.SNicsLU_up_set(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(value));
  }

  public SWIGTYPE_p_size_t getUp() {
    long cPtr = nicsluJNI.SNicsLU_up_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_size_t(cPtr, false);
  }

  public void setLlen(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_llen_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getLlen() {
    long cPtr = nicsluJNI.SNicsLU_llen_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setUlen(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_ulen_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getUlen() {
    long cPtr = nicsluJNI.SNicsLU_ulen_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setLen_est(SWIGTYPE_p_size_t value) {
    nicsluJNI.SNicsLU_len_est_set(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(value));
  }

  public SWIGTYPE_p_size_t getLen_est() {
    long cPtr = nicsluJNI.SNicsLU_len_est_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_size_t(cPtr, false);
  }

  public void setWkld_est(SWIGTYPE_p_size_t value) {
    nicsluJNI.SNicsLU_wkld_est_set(swigCPtr, this, SWIGTYPE_p_size_t.getCPtr(value));
  }

  public SWIGTYPE_p_size_t getWkld_est() {
    long cPtr = nicsluJNI.SNicsLU_wkld_est_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_size_t(cPtr, false);
  }

  public void setRow_state(SWIGTYPE_p_byte__t value) {
    nicsluJNI.SNicsLU_row_state_set(swigCPtr, this, SWIGTYPE_p_byte__t.getCPtr(value));
  }

  public SWIGTYPE_p_byte__t getRow_state() {
    long cPtr = nicsluJNI.SNicsLU_row_state_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_byte__t(cPtr, false);
  }

  public void setLu_array2(SWIGTYPE_p_p_void value) {
    nicsluJNI.SNicsLU_lu_array2_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getLu_array2() {
    long cPtr = nicsluJNI.SNicsLU_lu_array2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public void setWorkspace(SWIGTYPE_p_void value) {
    nicsluJNI.SNicsLU_workspace_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getWorkspace() {
    long cPtr = nicsluJNI.SNicsLU_workspace_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setWorkspace_mt1(SWIGTYPE_p_p_void value) {
    nicsluJNI.SNicsLU_workspace_mt1_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getWorkspace_mt1() {
    long cPtr = nicsluJNI.SNicsLU_workspace_mt1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public void setWorkspace_mt2(SWIGTYPE_p_p_void value) {
    nicsluJNI.SNicsLU_workspace_mt2_set(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_p_void getWorkspace_mt2() {
    long cPtr = nicsluJNI.SNicsLU_workspace_mt2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_void(cPtr, false);
  }

  public void setThread_work(int value) {
    nicsluJNI.SNicsLU_thread_work_set(swigCPtr, this, value);
  }

  public int getThread_work() {
    return nicsluJNI.SNicsLU_thread_work_get(swigCPtr, this);
  }

  public void setThread_id(SWIGTYPE_p_void value) {
    nicsluJNI.SNicsLU_thread_id_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getThread_id() {
    long cPtr = nicsluJNI.SNicsLU_thread_id_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setThread_arg(SWIGTYPE_p_void value) {
    nicsluJNI.SNicsLU_thread_arg_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getThread_arg() {
    long cPtr = nicsluJNI.SNicsLU_thread_arg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setThread_active(SWIGTYPE_p_bool__t value) {
    nicsluJNI.SNicsLU_thread_active_set(swigCPtr, this, SWIGTYPE_p_bool__t.getCPtr(value));
  }

  public SWIGTYPE_p_bool__t getThread_active() {
    long cPtr = nicsluJNI.SNicsLU_thread_active_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool__t(cPtr, false);
  }

  public void setThread_finish(SWIGTYPE_p_bool__t value) {
    nicsluJNI.SNicsLU_thread_finish_set(swigCPtr, this, SWIGTYPE_p_bool__t.getCPtr(value));
  }

  public SWIGTYPE_p_bool__t getThread_finish() {
    long cPtr = nicsluJNI.SNicsLU_thread_finish_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool__t(cPtr, false);
  }

  public void setCluster_start(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_cluster_start_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getCluster_start() {
    long cPtr = nicsluJNI.SNicsLU_cluster_start_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setCluster_end(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_cluster_end_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getCluster_end() {
    long cPtr = nicsluJNI.SNicsLU_cluster_end_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setPipeline_start(int value) {
    nicsluJNI.SNicsLU_pipeline_start_set(swigCPtr, this, value);
  }

  public int getPipeline_start() { return nicsluJNI.SNicsLU_pipeline_start_get(swigCPtr, this); }

  public void setPipeline_end(int value) {
    nicsluJNI.SNicsLU_pipeline_end_set(swigCPtr, this, value);
  }

  public int getPipeline_end() { return nicsluJNI.SNicsLU_pipeline_end_get(swigCPtr, this); }

  public void setLast_busy(int value) {
    nicsluJNI.SNicsLU_last_busy_set(swigCPtr, this, value);
  }

  public int getLast_busy() { return nicsluJNI.SNicsLU_last_busy_get(swigCPtr, this); }

  public void setAeg_level(int value) {
    nicsluJNI.SNicsLU_aeg_level_set(swigCPtr, this, value);
  }

  public int getAeg_level() { return nicsluJNI.SNicsLU_aeg_level_get(swigCPtr, this); }

  public void setAeg_data(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_aeg_data_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAeg_data() {
    long cPtr = nicsluJNI.SNicsLU_aeg_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setAeg_header(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_aeg_header_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAeg_header() {
    long cPtr = nicsluJNI.SNicsLU_aeg_header_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setAeg_refact_level(int value) {
    nicsluJNI.SNicsLU_aeg_refact_level_set(swigCPtr, this, value);
  }

  public int getAeg_refact_level() { return nicsluJNI.SNicsLU_aeg_refact_level_get(swigCPtr, this); }

  public void setAeg_refact_data(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_aeg_refact_data_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAeg_refact_data() {
    long cPtr = nicsluJNI.SNicsLU_aeg_refact_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setAeg_refact_header(SWIGTYPE_p_uint__t value) {
    nicsluJNI.SNicsLU_aeg_refact_header_set(swigCPtr, this, SWIGTYPE_p_uint__t.getCPtr(value));
  }

  public SWIGTYPE_p_uint__t getAeg_refact_header() {
    long cPtr = nicsluJNI.SNicsLU_aeg_refact_header_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint__t(cPtr, false);
  }

  public void setTimer(SWIGTYPE_p_void value) {
    nicsluJNI.SNicsLU_timer_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getTimer() {
    long cPtr = nicsluJNI.SNicsLU_timer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SNicsLU() {
    this(nicsluJNI.new_SNicsLU(), true);
  }

}
