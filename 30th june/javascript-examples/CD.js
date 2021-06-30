class CD
{
_cdId;
_cdName;

constructor(_cdId,_cdName)
{
    console.log('cd constructor called');
    this._cdId=_cdId;
    this._cdName= _cdName;
}

getDetails()
{
    return 'cd id : '+this._cdId+' cd name: '+this._cdName;
}


}

class SpecialEditionCD extends CD

{

    _specialFeature;

    constructor(_specialFeature)
    {
        super(100,'Titanic');
        this._specialFeature=_specialFeature;
        console.log('special edition cd constructor called');
    }
    getDetails()
    {
        return super.getDetails()+ 'special feature is: '+this._specialFeature;
    }

}

class InternationalEditionCD extends CD

{

    _internationalFeature;

    constructor(_internationalFeature)
    {
        super(200,'Rome');
       this._internationalFeature = _internationalFeature;
        console.log('International edition cd constructor called');
    }
    getDetails()
    {
        return super.getDetails()+ 'International feature is: '+this._internationalFeature;
    }

}



let _cd1=new SpecialEditionCD('3D');
console.log(_cd1.getDetails());
let _cd2 = new InternationalEditionCD('international 5 D');
console.log(_cd2.getDetails());
