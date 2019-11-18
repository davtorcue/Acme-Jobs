<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-double code="administrator.spam.form.label.spamthreshold" path="spamthreshold"/>
	<acme:form-textarea code="administrator.spam.form.label.spamwords" path="spamwords"/>
  	
  	<acme:form-submit test="${command == 'show'}" code= "administrator.spam.form.button.update" action= "/administrator/spam/update"/>
  	<acme:form-submit test="${command == 'update'}" code= "administrator.spam.form.button.update" action= "/administrator/spam/update"/>
  	<acme:form-return code="administrator.spam.form.button.return"/>
</acme:form>