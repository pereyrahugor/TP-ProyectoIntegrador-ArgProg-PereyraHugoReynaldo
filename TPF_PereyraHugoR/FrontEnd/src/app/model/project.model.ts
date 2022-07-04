export class project {

    id?: number;
    imgProyecto: String;
    nombreProyecto: String;
    descripcionProyecto: String;
    linkProyecto: String;

    constructor(imgProyecto: String, nombreProyecto: String, descripcionProyecto: String, linkProyecto: String) {

        this.imgProyecto = imgProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.linkProyecto = linkProyecto;

    }

}