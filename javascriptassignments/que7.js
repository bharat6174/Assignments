const showCourses = (...courses) => {
    console.log("Courses having 'a' in thier name:");
    courses.forEach(course => {
        if (course.toLowerCase().includes('a')) {
            console.log(course);
        }
    });
};

// Call the function with course names
showCourses('Java', 'HTML', 'JavaScript', 'Spring','Angular','Ajax');