export class experience {

    id?: number;
    imgBusiness: string;
    business: string;
    position: string;
    yearIn: Date;
    yearOut: Date;
    descriptionPosition: String;

    constructor (imgBusiness: string, business: string, position: string,
                 yearIn: Date, yearOut: Date, descriptionPosition: String) {
        
        this.imgBusiness = imgBusiness;
        this.business = business;
        this.position = position;
        this.yearIn = yearIn;
        this.yearOut = yearOut;
        this.descriptionPosition = descriptionPosition;
        }

}