
//get rollid after 2 sec
//get userdetails after 2 sec
//get coursedetails after 3 sec

const rollPromise = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let rollId = [1, 2, 3];
            resolve(rollId);
        }, 2000);
    });
}
const userPromise = (rollId) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let rollIdDetails = {
                1: { 'name': 'Abhishek', 'age': 31, "course_id": 2 },
                2: { 'name': 'Sahil', 'age': 30, "course_id": 34 },
                3: { 'name': 'king', 'age': 32, "course_id": 35 }
            };
            if (typeof rollIdDetails[rollId] == "undefined")
                reject(`Roll id ${rollId} not registered`);
            else
                resolve(rollIdDetails[rollId]);
        }, 5000);
    });
}

const coursePromise = (courseId) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let courseDetails = {
                2: { 'course': 'CSE' },
                34: { 'course': '10' },
                35: { 'course': 'ECE' }
            };
            if (typeof courseDetails[courseId] == "undefined")
                reject(`Course having ${courseId} not registered`);
            else
                resolve(courseDetails[courseId]);
        }, 1000);
    });
};
let rollIdDetails = 1;
const promise = new Promise((resolve, reject) => {
    return rollPromise().then((rollIds) => {
        console.log(rollIds);
        return userPromise(rollIdDetails).then((userDetails) => {
            console.log(userDetails);
            return coursePromise(userDetails['course_id']).then((courseDetails) => {
                 console.log(courseDetails);
            }).catch((e) => {
                console.log(e);
            });
        }).catch((e) => {
            console.log(e);
        });
    }).catch((e) => {
        console.log(e);
    });
}).catch((e) => {
    console.log(e);
});