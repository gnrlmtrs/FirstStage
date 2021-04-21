const assert = require('chai').assert;

const PLANE = require('../Planes/Plane');
const MILITARY_PLANE = require('../Planes/MilitaryPlane');
const PASSENGER_PLANE = require('../Planes/PassengerPlane');
const AIRPORT = require('../Airport');
const MILITARY_TYPE = require('../models/MilitaryType');
const EXPERIMENTAL_PLANE = require('../Planes/ExperimentalPlane');
const EXPERIMENTAL_TYPES = require('../models/ExpertimentalTypes');
const CLASSIFICATION_LEVEL = require('../models/ClassificationLevel');

describe('My Test', () => {

    let planes = [
        new PASSENGER_PLANE('Boeing-737', 900, 12000, 60500, 164),
        new PASSENGER_PLANE('Boeing-737-800', 940, 12300, 63870, 192),
        new PASSENGER_PLANE('Boeing-747', 980, 16100, 70500, 242),
        new PASSENGER_PLANE('Airbus A320', 930, 11800, 65500, 188),
        new PASSENGER_PLANE('Airbus A330', 990, 14800, 80500, 222),
        new PASSENGER_PLANE('Embraer 190', 870, 8100, 30800, 64),
        new PASSENGER_PLANE('Sukhoi Superjet 100', 870, 11500, 50500, 140),
        new PASSENGER_PLANE('Bombardier CS300', 920, 11000, 60700, 196),
        new MILITARY_PLANE('B-1B Lancer', 1050, 21000, 80000, MILITARY_TYPE.BOMBER),
        new MILITARY_PLANE('B-2 Spirit', 1030, 22000, 70000, MILITARY_TYPE.BOMBER),
        new MILITARY_PLANE('B-52 Stratofortress', 1000, 20000, 80000, MILITARY_TYPE.BOMBER),
        new MILITARY_PLANE('F-15', 1500, 12000, 10000, MILITARY_TYPE.FIGHTER),
        new MILITARY_PLANE('F-22', 1550, 13000, 11000, MILITARY_TYPE.FIGHTER),
        new MILITARY_PLANE('C-130 Hercules', 650, 5000, 110000, MILITARY_TYPE.TRANSPORT),
        new EXPERIMENTAL_PLANE("Bell X-14", 277, 482, 500,
            EXPERIMENTAL_TYPES.HIGH_ALTITUDE, CLASSIFICATION_LEVEL.SECRET),
        new EXPERIMENTAL_PLANE("Ryan X-13 Vertijet", 560, 307, 500,
            EXPERIMENTAL_TYPES.VTOL, CLASSIFICATION_LEVEL.TOP_SECRET)
    ];
    let planeWithMaxPassengerCapacity = new PassengerPlane('Boeing-747', 980, 16100, 70500, 242);

    it('should have military Planes with transport type', () => {
        let Airport = new AIRPORT(planes);
        let transportMilitaryPlanes = Airport.getTransportMilitaryPlanes();
        let flag = false;
        for (let militaryPlane of transportMilitaryPlanes) {
            if (militaryPlane.getMilitaryType() === MILITARY_TYPE.TYPE_TRANSPORT) {
                flag = true;
                break;
            }
        }
        assert.equal(flag, true);
    });


    it('should check passenger plane with max capacity', () => {
        let Airport = new AIRPORT(planes);
        let expectedPlaneWithMaxPassengersCapacity = Airport.getPassengerPlaneWithMaxPassengersCapacity();
        assert.isFalse(expectedPlaneWithMaxPassengersCapacity === planeWithMaxPassengerCapacity);
    });


    it('should get passenger plane with max capacity', () => {
        let Airport = new AIRPORT(planes);
        Airport.sortByMaxLoadCapacity();
        let planesSortedByMaxLoadCapacity = Airport.getPlanes();
        let nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (let i = 0; i < planesSortedByMaxLoadCapacity.length - 1; i++) {
            let currentPlane = planesSortedByMaxLoadCapacity[i];
            let nextPlane = planesSortedByMaxLoadCapacity[i + 1];
            if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        assert.isTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    });


    it('should show at least one bomber in military planes', () => {
        let Airport = new AIRPORT(planes);
        let bomberMilitaryPlanes  = Airport.getBomberMilitaryPlanes();
        let flag = false;
        bomberMilitaryPlanes.forEach((militaryPlane) => {
            if (militaryPlane.getMilitaryType() === MILITARY_TYPE.BOMBER) {
                flag = true;
            }
            else {
                assert.fail("Test failed!");
            }
        });
    });


    it('should check that experimental planes has classification level higher than unclassified', () => {
        let Airport = new AIRPORT(planes);
        let bomberMilitaryPlanes  = Airport.getExperimentalPlanes();
        let hasUnclassifiedPlanes  = false;
        bomberMilitaryPlanes.forEach((experimentalPlane) => {
            if (experimentalPlane.classificationLevel === CLASSIFICATION_LEVEL.UNCLASSIFIED) {
                hasUnclassifiedPlanes = true;
            }
            assert.isFalse(hasUnclassifiedPlanes);
        });
    });
});



