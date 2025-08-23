package day6_assignment;

	enum PriorityLevel {
	    LOW(1, "Low priority - minor issue"),
	    MEDIUM(2, "Medium priority - moderate impact"),
	    HIGH(3, "High priority - requires attention"),
	    CRITICAL(4, "Critical priority - immediate action needed");

	    private final int severity;
	    private final String description;

	    PriorityLevel(int severity, String description) {
	        this.severity = severity;
	        this.description = description;
	    }

	    public int getSeverity() {
	        return severity;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public boolean isUrgent() {
	        return severity >= 3; // HIGH and CRITICAL are urgent
	    }
	}

	public class Prority_level_enum {
	    public static void main(String[] args) {
	        System.out.println("Priority Levels:");
	        System.out.println("----------------");

	        for (PriorityLevel level : PriorityLevel.values()) {
	            System.out.println(level + 
	                " (Severity: " + level.getSeverity() + 
	                ") -> " + level.getDescription() + 
	                " | Urgent? " + level.isUrgent());
	        }
	    }
	}
