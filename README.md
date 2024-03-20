# Prueba Tecnica Java Spring boot

Para dar un contexto general del paso a paso de como lo solucione
fue el siguiente, primero analice la descripcion del problema luego de tener
todo los requerimientos claro elegi que arquitectura usar, dado que es una 
aplicacion pequeña lo mas conveniente es usar una arquitectura ligera para no aplicar
sobre ingenieria con una arquitectura mas sobusta como la hexagonal, entonces
lo que hice fue usar el principio de separación de responsabilidades y principios SOLID
que consiste en separa los contexto para tener alta cohesion en los diferentes modulos,
luego de generar esa estructura me dedique a probar el software con test unitarias y mockito,
luego el siguiente paso es documentar los endpoint para eso use swagger donde se puede ver
los endpoint que expongo ya con eso daria terminada la aplicacion, utilice interceptores para
manejar los erroes de mi dto, habiilite los cors para que el frontend se pueda conectar sin problema
separe la logica del controlador mediantes servicios