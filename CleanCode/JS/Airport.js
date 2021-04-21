const PASSENGER_PLANE = require('./Planes/PassengerPlane');
const MILITARY_PLANE = require('./Planes/MilitaryPlane');
const MILITARY_TYPE = require('./models/MilitaryType');
const EXPERIMENTAL_PLANE = require('./Planes/ExperimentalPlane');

class Airport {

    constructor(planes) {
        this.planes = planes;
    }

     getPassengerPlanes() {
        let passengerPlanes = [];
        this.planes.forEach((plane) => {
            if (plane instanceof PASSENGER_PLANE) {
                passengerPlanes.push(plane);
            }
        });
        return passengerPlanes;
     }

    getMilitaryPlanes() {
        let militaryPlanes = [];
        this.planes.forEach((plane) => {
            if (plane instanceof MILITARY_PLANE) {
                militaryPlanes.push(plane);
            }
        });
        return militaryPlanes;
    }

    getPassengerPlaneWithMaxPassengersCapacity() {
        let passengerPlanes = this.getPassengerPlanes();
        let planeWithMaxCapacity = passengerPlanes[0];
        for (let i = 0; i < passengerPlanes.length; i++) {
            if (passengerPlanes[i].getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes[i];
            }
        }
        return planeWithMaxCapacity;
    }

    getTransportMilitaryPlanes() {
        let transportMilitaryPlanes = [];
        let militaryPlanes = this.getMilitaryPlanes();
        for (let i = 0; i < militaryPlanes.length; i++) {
             if (militaryPlanes[i].getMilitaryType() === MILITARY_TYPE.TYPE_TRANSPORT) {
                 transportMilitaryPlanes.push(militaryPlanes[i]);
            }
        }
        return transportMilitaryPlanes;
    }

    getBomberMilitaryPlanes() {
        let bomberMilitaryPlanes = [];
        let militaryPlanes = this.getMilitaryPlanes();
        for (let i = 0; i < militaryPlanes.length; i++) {
            if (militaryPlanes[i].getMilitaryType() === MILITARY_TYPE.TYPE_BOMBER) {
                bomberMilitaryPlanes.push(militaryPlanes[i]);
            }
        }
        return bomberMilitaryPlanes;
    }

    getExperimentalPlanes() {
        let experimentalPlanes = [];
        this.planes.forEach((plane) => {
            if (plane instanceof EXPERIMENTAL_PLANE) {
                experimentalPlanes.push(plane);
            }
        });
        return experimentalPlanes;
    }

    sortByMaxDistance() {
        this.planes.sort((firstPlane, secondPlane) =>
            (firstPlane.getMaxFlightDistance() > secondPlane.getMaxFlightDistance()) ? 1 : -1);
        return this;
    }

    sortByMaxSpeed() {
        this.planes.sort((firstPlane, secondPlane) =>
            (firsPlane.getMaxSpeed() > secondPlane.getMaxSpeed()) ? 1 : -1);
        return this;
    }

    sortByMaxLoadCapacity() {
        this.planes.sort((firstPlane, secondPlane) =>
            (firsPlane.getMinLoadCapacity() > secondPlane.getMinLoadCapacity()) ? 1 : -1);
        return this;
    }

    getPlanes() {
        return this.planes;
    }

    static print(planes) {
        return JSON.stringify(planes);
    }
}

module.exports = Airport;
