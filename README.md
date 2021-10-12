# ChangeSizeText

En este proyecto hemos creado una aplicacion que consiste en un BasicActivity en la cual introducimos un texto en un objeto EditText y modificamos el valor una SeekBar, y al pulsar un boton, nos dirige a otra BasicActivity donde aparecera un texto (TextField) con un tamaño igual al valor de la SeekBar.


### Clases del proyecto
Hemos creado dos clases POJO, una User (que no tiene funcion real dentro del proyecto) que hemos usado para un ejemplo y otra clase Message que esta si contenia la informacion del mensaje que se enviaba entre ambas Activity.
La clase Message contiene informacion del user, el mensaje de texto que se envia y el tamano con el que se mostrara (se usa en el atributo de tamano del TextView).

En cuanto a las clases de la interfaz del usuario tenemos:

- ChangeSizeTextActivity
- ViewMessageActivity

En la primera encontramos la creacion del paquete Intent en el que se enviaran los datos que modificaran el texto en la siguiente actividad.

En la segunda se recoge y desempaqueta el Intent y se modifica un objeto TextView

Tambien hay una clase ChangeSizeApplication que es nuestra clase Application, donde se guardan ciertos calores que necesitamos en todo el proyecto.
Esta clase hereda de la clase Application

### Conclusion y aspectos adquiridos
Durante el ejercicio hemos reforzado como enviar valores entre Actividades y hemos reforzado el uso del binding para actualizar atributos de los componentes de las Actividades.

- Uso de Intent
- Uso de Bundle
- Uso de Binding

Otro aspecto a destacar que he aprendido es saber que para poder Serializar un paquete o Deserializarlo (Intent), el objeto que contenga debe ser Serializable, y si este posee algun campo de tipo creado por nosotros, esta clase tambien debe de implementar la interfaz serializable.

Para terminar tambien he aprendido el uso de la clase Application y como crear nuestra propia clase Application para guardar ahi ciertos valores.
Para poder obtener datos de nuestra clase ChangeSizeApplication (hereda de Application) tenemos que hacer un casting al metodo getApplication() que nos devuelve nuestro objeto Application creado en el proyecto.
Una vez hecho el casting ya podemos extraer los valores con metodos Getters
```
java
public class ChangeSizeApplication extends Application {

    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Rafa","rafacarrascotm@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
```

### Layout ChangeSizeTextActivity
! [Layout ChangeSizeTextActivity](app/img/README_img2.png)
### Layout ViewMessageActivity
! [Layout ViewMessageActivity](app/img/README_img3.png)
