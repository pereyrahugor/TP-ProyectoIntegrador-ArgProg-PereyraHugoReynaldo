export class persona {
    
    id?: number;
    nombre: String;
    apellido: String;
    texto: String;
    descripcion: String;
    imgPerfil: String;
    imgBanner: String;
    pais: String;
    provincia: String;
    contacto: String;

    constructor (nombre: String, apellido: String, texto: String, descripcion: String, imgPerfil: String, imgBanner: String,
                pais: String, provincia: String, contacto: String) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.texto = texto;
        this.descripcion = descripcion;
        this.imgPerfil = imgPerfil;
        this.imgBanner = imgBanner;
        this.pais = pais;
        this.provincia = provincia;
        this.contacto = contacto;
    }
}