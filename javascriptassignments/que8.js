const showCourses = (...courses) => {
    const coursesA = [];

    courses.forEach(course => {
        if (course.toLowerCase().includes('a')) {
            coursesA.push(" " + course);
        }
    });

    return coursesA;
};

console.log("Courses containing 'a': " + showCourses('Java', 'HTML', 'JavaScript', 'Spring', 'Angular', 'Ajax'));