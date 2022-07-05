export class skill{

    id?: number;
    imgHabilidad: String;
    colorInterno: String;
    colorExterno: String;
    nombreHabilidad: String;
    progreso: number;

    constructor (imgHabilidad: String, colorInterno: String, colorExterno: String, nombreHabilidad: String, progreso: number) {

        this.imgHabilidad = imgHabilidad;
        this.colorInterno = colorInterno;
        this.colorExterno = colorExterno;
        this.nombreHabilidad = nombreHabilidad;
        this.progreso = progreso;

    }

}