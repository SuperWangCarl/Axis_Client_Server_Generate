@echo off
echo "正在根据deploy.wsdd发布服务..."
set AXIS_HOME=D:/OpenSource/axis1.4
set AXIS_LIB=%AXIS_HOME%\lib
set AXISCLASSPATH=%AXIS_LIB%\axis.jar;%AXIS_LIB%\commons-discovery-0.2.jar;%AXIS_LIB%\commons-logging-1.0.4.jar;%AXIS_LIB%\jaxrpc.jar;%AXIS_LIB%\saaj.jar;%AXIS_LIB%\log4j-1.2.8.jar;%AXIS_LIB%\wsdl4j-1.5.1.jar
:: http 地址 services 之后可以随意写  即http://localhost:8080/nmsw/services/xxxxxxxxx
:: 访问wsdl  
:: http://localhost:8080/admin_education/servlet/AxisServlet  
:: 之后跳转到 --> http://localhost:8080/admin_education/services/notifyReq?wsdl
java -cp %AXISCLASSPATH% org.apache.axis.client.AdminClient -lhttp://localhost:8080/notify/services/notify deploy.wsdd
pause