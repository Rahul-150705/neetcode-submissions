
class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Count frequency using HashMap
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char task : tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freqMap.values());

        int time = 0;

        // Step 3: Process tasks
        while (!maxHeap.isEmpty()) {
            int cycle = n + 1;
            List<Integer> temp = new ArrayList<>();

            while (cycle > 0 && !maxHeap.isEmpty()) {
                int count = maxHeap.poll();
                if (count > 1) {
                    temp.add(count - 1);
                }
                time++;
                cycle--;
            }

            // Re-add remaining tasks
            for (int cnt : temp) {
                maxHeap.offer(cnt);
            }

            // If heap is not empty, add idle time
            if (!maxHeap.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}
