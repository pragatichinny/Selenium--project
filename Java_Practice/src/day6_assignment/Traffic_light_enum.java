package day6_assignment;

	// State interface
	interface State {
	    State next();
	}

	// TrafficLight enum implementing State
	enum TrafficLight implements State {
	    RED {
	        @Override
	        public State next() {
	            return GREEN;
	        }
	    },
	    GREEN {
	        @Override
	        public State next() {
	            return YELLOW;
	        }
	    },
	    YELLOW {
	        @Override
	        public State next() {
	            return RED;
	        }
	    };
	}

	public class Traffic_light_enum {
	    public static void main(String[] args) {
	        State light = TrafficLight.RED; // Start at RED

	        System.out.println("Traffic Light Simulation:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println("Step " + (i + 1) + ": " + light);
	            light = light.next();
	        }
	    }
	}
