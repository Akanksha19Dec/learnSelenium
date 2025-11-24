package com.learnAutomationWitAk.Tests;

public class Selenium_XpathAxes {

    //Context-Node(Self)
    //div[@class="Mammal"] -->Mammal
    //ancestors
    //div[@class="Mammal"]/ancestors::div  --> Vertebrate and Animal
//div[@class="Mammal"]/preceding::div  -->Fish
    //div[@class="Mammal"]/following-sibling::div -->Other

    //div[@class="Mammal"]/child::div -> Herbivore,Carnivore

    //div[@class="Mammal"]/descendant::div --> Herbivore,Carnivore,Lion,Tigers


    //------------------------Working example
    //Webtable
    //table[@id='customers']/tbody/tr[5]/td[2] --> Helen Bennett

    //table[@id='customers']/tbody/tr[5]/td[2]/preceding-sibling::td --> Island Trading

    //table[@id='customers']/tbody/tr[5]/td[2]/following-sibling::td  -->UK
    //

}
