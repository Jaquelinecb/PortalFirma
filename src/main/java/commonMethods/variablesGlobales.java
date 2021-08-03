package commonMethods;

public class variablesGlobales {
	
/*
	//ORACLE
	
	public static final String HOME_PAGE = "https://192.168.0.152:8473/Portal_Firma_RNE_Web/";
	//public static final String USER_LOGIN_PRE_4 = "jade.luna@yopmail.com";//Elizabeth 
	public static final String USER_LOGIN_PRE_4 = "Sodimac6.Alsea123";//Elizabeth 
	public static final String USER_LOGIN_PRE_8 = "bety.pg@yopmail.com";//u_prueba8@yopmail.com
	public static final String USER_LOGIN_PRE_9 = "maria.azucena@yopmail.com";
	public static final String USER_LOGIN_PRE_13 = "u_prueba13@yopmail.com";
	
*/
	
	//SQL 
	
	public static final String HOME_PAGE = "https://192.168.0.152:8473/Portal_Firma_RNE_Web/";
	public static final String HOME_PAGE_AGENTE = "https://192.168.0.152:8473/Portal_Agente_RNE_Web/";
	public static final String LIGA_YOPMAIL = "https://yopmail.com/es/";
	
	public static final String USER_LOGIN_PRE_4 = "rene.lopez@yopmail.com";
	public static final String USER_LOGIN_PRE_8 = "ana-torres@yopmail.com"; //SQL-carlos.rivera@seguridata.com
	public static final String USER_LOGIN_PRE_9 = "blanca@seguridata.com";//SQL-amelia9@seguridata.com
	public static final String USER_LOGIN_PRE_13 = "asalgado.p@seguridata.com";
	
	public static final String USER_LOGIN_PERFIL_4 = "Usuario1";
	public static final String PASSWORD_LOGIN_PERFIL_4 = "12121212Qw.";
	public static final String Clave_Llave_Privada = "12121212Qw.";

	
	//INVITADOS
	public static final String USER_A_ELIMINAR_INVITADO14 = "alex-mota@yopmail.com";
	public static final String USER_A_ELIMINAR_INVITADO14B = "israel.bautista@yopmail.com";
	
	

	public static final String NOMBRE_NUEVO_INVITADO14 = "Maira Rojas Muñoz";
	public static final String EMAIL_NUEVO_INVITADO14 = "maira.rojas@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO8 = "FIRMANTE INVITADO OCHO UNO";
	public static final String EMAIL_NUEVO_INVITADO8 = "firmante.invitado-8-1@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO9 = "INVITADO NUEVE PRUEBA QA UNO";
	public static final String EMAIL_NUEVO_INVITADO9 = "invitado.p9-prueba-uno@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO13 = "INVITADO TRECE PRUEBA QA UNO";
	public static final String EMAIL_NUEVO_INVITADO13 = "invitado.p13-prueba-uno@yopmail.com";
	
	
	//VARIABLES PARA BLOQUEAR / DESBLOQUEAR CUENTA
	
	public static final String USUARIO_A_BLOQUEAR = "Pruebáñ-1-123!\\\"#$%&/()=?¡|°'\\\\¿´+}¨*~]}`{[^-.,;:_<>@";

	public static final String LIGA_DESBLOQUEO = "https://192.168.0.152:8473/Portal_Firma_RNE_Web/update/lockAction_validarSolicitud.action?token=c6156c18-1952-4cff-988e-eda6bf7089ca";
	public static final String CLAVE_DESBLOQUEO = "b7Ik2i2CxF";


	/*
	 * Recibimos su petición de cambio de contraseña, a continuación tiene usted disponible una liga para el cambio de la misma:
https://192.168.0.152:8473/Portal_Firma_RNE_Web/update/lockAction_validarSolicitud.action?token=c6156c18-1952-4cff-988e-eda6bf7089ca

Al ingresar favor de utilizar la siguiente contraseña temporal:
b7Ik2i2CxF
	 */

	/*	
	
	//ECUADOR 
	
	public static final String HOME_PAGE = "https://192.168.0.250:5453/Portal_Firma_RNE_Web/";
	public static final String HOME_PAGE_AGENTE = "https://192.168.0.250:5453/Portal_Agente_RNE_Web/";
	public static final String LIGA_YOPMAIL = "https://yopmail.com/es/";
	
	public static final String USER_LOGIN_PRE_4 = "Usuario10";//Actualizar dato
	public static final String USER_LOGIN_PRE_8 = "ana-torres@yopmail.com"; //SQL-carlos.rivera@seguridata.com
	public static final String USER_LOGIN_PRE_9 = "Hortencia";//SQL-amelia9@seguridata.com
	public static final String USER_LOGIN_PRE_13 = "Maribel";
	
	public static final String USER_LOGIN_PERFIL_4 = "Usuario1";
	public static final String PASSWORD_LOGIN_PERFIL_4 = "12121212Qw.";
	public static final String Clave_Llave_Privada = "12121212Qw.";

	
	//INVITADOS
	public static final String USER_A_ELIMINAR_INVITADO14 = "alex-mota@yopmail.com";
	public static final String USER_A_ELIMINAR_INVITADO14B = "israel.bautista@yopmail.com";
	
	

	public static final String NOMBRE_NUEVO_INVITADO14 = "Maira Rojas Muñoz";
	public static final String EMAIL_NUEVO_INVITADO14 = "maira.rojas@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO8 = "FIRMANTE INVITADO OCHO UNO";
	public static final String EMAIL_NUEVO_INVITADO8 = "firmante.invitado-8-1@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO9 = "INVITADO NUEVE PRUEBA QA UNO";
	public static final String EMAIL_NUEVO_INVITADO9 = "invitado.p9-prueba-uno@yopmail.com";
	
	public static final String NOMBRE_NUEVO_INVITADO13 = "INVITADO TRECE PRUEBA QA UNO";
	public static final String EMAIL_NUEVO_INVITADO13 = "invitado.p13-prueba-uno@yopmail.com";
	
	
	//VARIABLES PARA BLOQUEAR / DESBLOQUEAR CUENTA
	
	public static final String USUARIO_A_BLOQUEAR = "Usuario_#4";

	public static final String LIGA_DESBLOQUEO = "https://192.168.0.250:5453/Portal_Firma_RNE_Web/update/lockAction_validarSolicitud.action?token=e107c96e-3a24-42b6-acdf-22a9eca8ace5";
	public static final String CLAVE_DESBLOQUEO = "HI4SbCa8xJ537Gd02BJ";


	 * https://192.168.0.250:5453/Portal_Firma_RNE_Web/update/lockAction_validarSolicitud.action?token=e107c96e-3a24-42b6-acdf-22a9eca8ace5

Al ingresar favor de utilizar la siguiente contraseña temporal:
HI4SbCa8xJ537Gd02BJ
	 */
	
	
}
