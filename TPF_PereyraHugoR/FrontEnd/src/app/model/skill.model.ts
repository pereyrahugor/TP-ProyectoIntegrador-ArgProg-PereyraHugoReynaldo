export class skill{

    id?: number;
    imgHabilidad: String;
    nombreHabilidad: String;
    progreso: String;

    constructor (imgHabilidad: String, nombreHabilidad: String, progreso: String) {

        this.imgHabilidad = imgHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.progreso = progreso;

    }

}