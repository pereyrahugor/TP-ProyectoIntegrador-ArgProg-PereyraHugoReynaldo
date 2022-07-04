export class education {
    
    id?: number;
    imgInstituto: string;
    titulo: string;
    anioCursado: Date;
    duracion: string;
    descripcionEdu: string;

    constructor (imgInstituto: string, titulo: string, anioCursado: Date,
                 duracion: string, descripcionEdu: string) {

        this.imgInstituto = imgInstituto;
        this.titulo = titulo;
        this.anioCursado = anioCursado;
        this.duracion = duracion;
        this.descripcionEdu = descripcionEdu;
    }

}