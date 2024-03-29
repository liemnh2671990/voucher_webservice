
package vn.vdconline.secondtelcoapi.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TelcoWebService", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TelcoWebService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.ChangeResponse
     */
    @WebMethod(operationName = "ChangeMPIN")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ChangeMPIN", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.ChangeMPIN")
    @ResponseWrapper(localName = "ChangeMPINResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.ChangeMPINResponse")
    public ChangeResponse changeMPIN(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.ChangeResponse
     */
    @WebMethod(operationName = "ChangePassword")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ChangePassword", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.ChangePassword")
    @ResponseWrapper(localName = "ChangePasswordResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.ChangePasswordResponse")
    public ChangeResponse changePassword(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.ChargeResponse
     */
    @WebMethod(operationName = "CardCharge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CardCharge", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.CardCharge")
    @ResponseWrapper(localName = "CardChargeResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.CardChargeResponse")
    public ChargeResponse cardCharge(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setSaivina", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.SetSaivina")
    @ResponseWrapper(localName = "setSaivinaResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.SetSaivinaResponse")
    public int setSaivina(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.LoginResponse
     */
    @WebMethod(operationName = "TestConnect")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "TestConnect", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.TestConnect")
    @ResponseWrapper(localName = "TestConnectResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.TestConnectResponse")
    public LoginResponse testConnect();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.LoginResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logIn", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.LogIn")
    @ResponseWrapper(localName = "logInResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.LogInResponse")
    public LoginResponse logIn(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restAllCounter", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.RestAllCounter")
    @ResponseWrapper(localName = "restAllCounterResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.RestAllCounterResponse")
    public int restAllCounter(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns vn.vdconline.secondtelcoapi.ws.LogoutResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "logOut", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.LogOut")
    @ResponseWrapper(localName = "logOutResponse", targetNamespace = "http://ws.secondtelcoAPI.vdconline.vn/", className = "vn.vdconline.secondtelcoapi.ws.LogOutResponse")
    public LogoutResponse logOut(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

}
