export class hello{
    public a:Number;
    constructor(){
        this.a = 1;
        console.log(`in constructor :  ${this.a} `);
    }
    display = () => { console.log(`in display :  ${this.a} `)}
    static displayStatic = () => { console.log(`in display method`)};
}
