class StudyGroupViewer {
    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName());
        }
    }
}