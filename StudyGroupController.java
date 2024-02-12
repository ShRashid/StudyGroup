import java.util.List;

class StudyGroupController {
    private StudyGroupService studyGroupService;

    public void start() {
        Teacher teacher = new Teacher(1, "Путин В.В.");
        List<Student> students = List.of(new Student(1, "Медеведев Д.А."), 
                                        new Student(2, "Мишустин М.В."));

        StudyGroup studyGroup = formStudyGroup(teacher, students);
        
        StudyGroupViewer studyGroupViewer = new StudyGroupViewer();
        studyGroupViewer.displayStudyGroup(studyGroup);
    }    

    public StudyGroupController(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}