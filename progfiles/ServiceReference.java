    	agentServiceReference             =
    			context.getServiceReferences(Agent.class.getName(), "(AgentName=RandomAgent)");
    	agent                             = (Agent) context.getService(agentServiceReference[0]);