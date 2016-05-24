
package br.com.isoccer.servicos.usuarioservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioService", targetNamespace = "http://isoccer.com.br/servicos/UsuarioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioService {


    /**
     * 
     * @param inBuscarUsuario
     * @return
     *     returns br.com.isoccer.servicos.usuarioservice.OutBuscarUsuario
     * @throws IspoException_Exception
     */
    @WebMethod
    @WebResult(name = "usuario", targetNamespace = "http://isoccer.com.br/servicos/UsuarioService", partName = "usuario")
    public OutBuscarUsuario buscarUsuario(
        @WebParam(name = "inBuscarUsuario", targetNamespace = "http://isoccer.com.br/servicos/UsuarioService", partName = "inBuscarUsuario")
        InBuscarUsuario inBuscarUsuario)
        throws IspoException_Exception
    ;

}
