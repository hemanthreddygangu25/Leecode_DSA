class TaskManager {
    Map<Integer,Integer> taskPriority = new HashMap<>();
    Map<Integer,Integer> taskUser = new HashMap<>();
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b) -> a[0] != b[0] ? Integer.compare(b[0],a[0]) : Integer.compare(b[1], a[1])
    );

    public TaskManager(List<List<Integer>> tasks) {
        for(final var x : tasks){
            taskPriority.put(x.get(1),x.get(2));
            taskUser.put(x.get(1), x.get(0));

            int[] priorityTask = new int[]{x.get(2), x.get(1)};
            pq.add(priorityTask);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        taskPriority.put(taskId,priority);
        taskUser.put(taskId,userId);
        
        pq.add(new int[]{priority, taskId});
    }
    
    public void edit(int taskId, int newPriority) {
        taskPriority.put(taskId, newPriority);
    
        int[] priorityTask = new int[]{newPriority, taskId};
        pq.add(priorityTask);
    }
    
    public void rmv(int taskId) {
        taskUser.remove(taskId);
        taskPriority.remove(taskId);
        
    }
    
    public int execTop() {
        while(!pq.isEmpty()){
            int[] info = pq.peek();
            int taskId = info[1];
            int priority = info[0];
            Integer isValidPrio = taskPriority.get(taskId); 
           

            if(isValidPrio == null || isValidPrio != priority){
                
                pq.poll();
                continue;
            }

            pq.poll(); 
            int ans = taskUser.get(taskId);
            taskPriority.remove(taskId);
            taskUser.remove(taskId);
            return ans;
        }
        return -1;
    }
}