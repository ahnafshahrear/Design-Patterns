public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public void execute() {
        doExecute();
        auditTrail.record();
    }    

    protected abstract void doExecute();
}