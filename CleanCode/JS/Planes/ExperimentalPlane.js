const PLANE = require('./Plane');

class ExperimentalPlane  extends PLANE {
    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, Type, classificationLevel)  {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
        this.Type = Type;
        this.classificationLevel = classificationLevel;
    }

    getModel()
    {
        return this.model;
    }

    setModel(value) {
        this.model = value;
    }

    getMaxSpeed() {
        return this.maxSpeed;
    }

    setMaxSpeed(value) {
        this.maxSpeed = value;
    }

    getMaxFlightDistance() {
        return this.maxFlightDistance;
    }

    setMaxFlightDistance(value) {
        this.maxFlightDistance = value;
    }

    getMaxLoadCapacity() {
        return this.maxLoadCapacity;
    }

    setMaxLoadCapacity(value) {
        this.maxLoadCapacity = value;
    }

    getType() {
        return this.Type;
    }

    setType(value) {
        this.Type = value;
    }

    getClassificationLevel() {
        return this.classificationLevel;
    }

    setClassificationLevel(value) {
        this.classificationLevel = value;
    }
}

module.exports = ExperimentalPlane;