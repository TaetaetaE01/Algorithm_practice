# Algorithm

- 자료구조
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
        
- 정렬
    - 버블 정렬(Bubble Sort)
        - 두 개의 인접한 원소를 비교하여 정렬하는 방식
        
        - 장점 : 추가적인 메모리 소비가 작음 / 구현이 매우쉬움 / 안정정렬이 가능
        - 단점 : 다른 정렬 알고리즘에 비해 교환 과정이 많아 많은 시간을 소비함
        - 시간 복잡도 :  O(N^)
    - 선택 정렬(Selection Sort)
        - 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘
        - 데이터를 비교하며 찾는다
        
        ### <방법>
        
        1. 주어진 리스트에서 최솟값을 찾는다.
        2. 최솟값을 맨 앞 자리의 값과 교환한다.
        3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
        
        - 장점 : 추가적인 메모리 소비가 작다.
        - 단점 :  안정 정렬이 아님
        - 시간 복잡도 :  O(N^)
    - 삽입 정렬(Insertion Sort)
        - 앞에서부터 해당 원소가 위치할 곳을 탐색하고 해당 위치에 삽입하는 것
        
        ### <방법>
        
        1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다
        2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
        3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
        
        - 장점 : 추가적인 메모리 소비가 작다 / 거의 정렬 된 경우 매우 효율적이다O(N) / 안장 정렬
        - 단점 :  역순에 가까울수록 비효율적이다 O(N^) / 데이터 상태에 따라 편차가 크다
        - 시간 복잡도 :  O(N^)
    - 퀵 정렬(Quick Sort)
        - 피벗(pivot)을 기준으로 나눠 피벗보다 크거나 작은부분들의 리스트를 정렬한 수 각 부분리스트에 대해 다시 위 처럼 재귀적으로 수행하여 정렬한다.
        
        ### <방법>
        
        1. 피벗을 하나 선택한다.
        2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다. 왼쪽은 피벗보다 크게, 오른쪽은 피벗보다 작게
        3. 양 방향에서 찾은 두 원소를 교환
        4. 왼쪽에서 탐색하는 위치와 오른쪽에서 탐색하는 위치가 엇갈리지 않을 때 까지 2번으로 돌아가 위 과정을 반복한다.
        5. 엇갈린 기점을 기준으로 두 개 의 부분리스트로 나누어 1번으로 돌아가 해당 부분리스트의 길이가 1이 아닐 때 까지 1번 과정을 반복한다
        6. 인접한 부분리스트끼리 합친다
        
        - 장점 : NlogN 알고리즘에 비해 대체적으로 속도가 매우 빠르다
        - 단점 :  특정 조건하에 성능이 급격하게 떨어짐/ 재귀를 사용하기 때문에 재귀를 사용못하는 경우 구현이 매우 복잡해짐
        - 시간 복잡도 :  O(NlogN)
    - 병합 정렬(Merge Sort)
        - 리스트를 분할을 반복하여 최대한 작게 쪼개진 시점에 부분리스트에서 인접한 원소들끼리 비교하여 정렬
        
        ### <방법>
        
        1. 주어진 리스트를 절반으로 분할하여 부분리스트로 나눈다
        2. 해당 부분리스트의 길이가 1이 아니라면 1번 과정을 되풀이한다
        3. 인접한 부분리스트끼리 정렬하여 합친다
        
        - 장점 : 항상 두 부분리스트로 쪼개기 때문에 O(NlogN)유지
        - 단점 : 정렬과정에서 추가적인 보조 배열 공간을 사용하기 때문에 메모리 사용량이 많다 / 보조 배열에서 원본배열로 복사하는 과정은 매우 많은 시간을 소비하기 때문에 데이터가 많을경우 상대적으로 시간이 많이 소요된다
        - 시간 복잡도 :  O(NlogN)
