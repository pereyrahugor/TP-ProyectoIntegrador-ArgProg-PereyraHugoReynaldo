export class skill{

    id?: number;
    imgHabilidad: String;
    nombreHabilidad: String;
    progreso: number;

    constructor (imgHabilidad: String, nombreHabilidad: String, progreso: number) {

        this.imgHabilidad = imgHabilidad;
        this.nombreHabilidad = nombreHabilidad;
        this.progreso = progreso;

    }

}