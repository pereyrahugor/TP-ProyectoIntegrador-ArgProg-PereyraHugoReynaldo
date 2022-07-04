export class experience {

    id?: number;
    imgEmpresa: string;
    empresa: string;
    puesto: string;
    anioIngreso: Date;
    anioEgreso: Date;
    descripcionPuesto: String;

    constructor (imgEmpresa: string, empresa: string, puesto: string,
                 anioIngreso: Date, anioEgreso: Date, descripcionPuesto: String) {
        
        this.imgEmpresa = imgEmpresa;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anioIngreso = anioIngreso;
        this.anioEgreso = anioEgreso;
        this.descripcionPuesto = descripcionPuesto;
        }

}