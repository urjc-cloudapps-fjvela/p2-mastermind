package mastermind.controllers;

public interface IControllerVisitor {

    void visit(StartController startController);

    void visit(ProposeCombinationController proposeCombinationController);

    void visit(ResumeController resumeController); 
} 