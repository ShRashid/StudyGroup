import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroupController studyGroupController = new StudyGroupController(studyGroupService);
        studyGroupController.start();

    }
}
