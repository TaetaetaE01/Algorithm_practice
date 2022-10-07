# Algorithm

- 스택과 큐
    - 스택(Stack)
        - 후입선출(LIFO)
        - 마지막에 추가된 데이터가 가장 먼저 나옴
        
        ```java
        Stack<Integer> stack = new Stack<>();
        // 데이터 추가
        stack.push(1);
        stack.push(2); 
        
        // 데이터 제거
        stack.pop();
        
        // top 데이터 값 출력
        stack.peek();
        ```
        
    - 큐(Queue)
        - 선입선출(FIFO)
        - 먼저 들어온 데이터가 가장 먼저 나가는 구조
        
        ```java
        Queue<Integer> queue = new LinkedList<>();
        // 데이터 추가
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        
        // 데이터 제거
        queue.poll(); // 첫 번째 데이터를 return 제거 데이터가 없으면 null return
        queue.remove(); // 첫 번째 데이터를 제거
        queue.clear(); // 데이터 초기화
        
        // rear 데이터 값 출력
        queue.peek();
        ```
    
- 그래프 탐색
    - 하나의 정점으로부터 시작하여 차레대로 모든 정점들을 한 번씩 방문하는 것(트리)
    - 깊이 우선 탐색(DFS, Depth-First Search)자기 자신을 호출하는 <Strong>순환 알고리즘</Strong>의 형태를 가지고 있음
        - 루트 노드(혹은 다른 노드)에서 시작하여 다음 분기(Branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방법
        
        ### <특징>
        
        - 미로를 탐색할 때 한 방향으로 갈 수 있을 떄까지 계속 가다가 더 이상 갈 수 없게 되면 다시 가장 가까운 갈림길로 돌아와서 이곳으로부터 다른 방향으로 다른 탐색을 진행하는 방법과 유사
        - 좌우로 넓게 탐색하기 이전에 깊게(Deep)하게 탐색
        - 모든 노드를 방문 하고자 하는 경우에 이 방법을 선택
        - 간단도 : 깊이 우선 탐색(DFS) > 너비 우선 탐색(BFS)
        - 속도 : 깊이 우선 탐색(DFS) < 너비 우선 탐색(BFS)
        - 자기 자신을 호출하는 <Strong>순환 알고리즘</Strong>의 형태를 가지고 있음
        - 전위 순회(Pre-Order Traversals)를 포함한 다른 형태의 트리 순회는 모두 DFS의 한 종류
        - 이 알고리즘을 구현할 때 가장 큰 차이점은, 그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사 해야 한다는 것
        
        > 이를 검사하지 않을 경우 무한루프에 빠질 위험이 있음
        > 
        
        ### <깊이 우선 탐색(DFS)의 과정>
        ![깊이 우선 탐색 과정](https://user-images.githubusercontent.com/68328998/129710000-ed8c4dbd-c86b-4144-a81c-4a50b4e59d20.PNG)

