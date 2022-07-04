export class persona {
    
    id?: number;
    nombre: string;
    apellido: string;
    descripcion: string;
    imgPerfil: string;
    imgBanner: string;
    pais: string;
    provincia: string;
    contacto: string;

    constructor (nombre: string,apellido: string, descripcion: string, imgPerfil: string, imgBanner: string,
                pais: string, provincia: string, contacto: string) {

        this.nombre = nombre;
        this.apellido =apellido;
        this.descripcion = descripcion;
        this.imgPerfil = imgPerfil;
        this.imgBanner = imgBanner;
        this.pais = pais;
        this.provincia = provincia;
        this.contacto = contacto;
    }
}