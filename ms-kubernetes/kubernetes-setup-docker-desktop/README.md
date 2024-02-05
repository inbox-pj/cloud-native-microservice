Step:1:	https://docs.docker.com/desktop/kubernetes/

Step-2:	https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/

Step-3: (in case kubernetes-dashboard pod is not coming healthy) - https://github.com/kubernetes/dashboard/releases

Step-4: run additionally docker pull kubernetesui/dashboard-web:v1.0.0 and docker pull kubernetesui/dashboard:v2.7.0 if pods are unhealthy

Step-5: apply setup-user.yaml

Step-6: access dashbaord on http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/#/workloads?namespace=kubernetes-dashboard