package com.adffaces.chapter9.model.client;

import com.adffaces.chapter9.model.common.Chapter9AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 03 05:55:52 GMT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Chapter9AMClient extends ApplicationModuleImpl implements Chapter9AM {
    /**
     * This is the default constructor (do not remove).
     */
    public Chapter9AMClient() {
    }

    public void throwRuntimeException() {
        Object _ret = this.riInvokeExportedMethod(this, "throwRuntimeException", null, null);
        return;
    }
}
