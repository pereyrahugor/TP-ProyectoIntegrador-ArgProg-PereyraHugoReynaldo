export class skill{

    id?: number;
    imgSkill: String;
    colorIn: String;
    colorOut: String;
    nameSkill: String;
    progress: number;

    constructor (imgSkill: String, colorIn: String, colorOut: String, nameSkill: String, progress: number) {

        this.imgSkill = imgSkill;
        this.colorIn = colorIn;
        this.colorOut = colorOut;
        this.nameSkill = nameSkill;
        this.progress = progress;

    }

}