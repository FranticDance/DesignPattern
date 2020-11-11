package com.my.pattern.behavior.responsibilitychain.impl7;


import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/20 9:37
 */
public class InterceptorChain {
    private List<Interceptor> interceptors;

    public InterceptorChain(List<Interceptor> interceptors) {
        this.interceptors = interceptors;
    }
    public Object registerAll(Object target){
        for(Interceptor interceptor:interceptors){
            target = TargetProxy.bind(target, interceptor);
        }
        return target;
    }
    public void addInterceptor(Interceptor interceptor){
        interceptors.add(interceptor);
    }
    public List<Interceptor> getInterceptor(){
        return interceptors;
        //return (Stack<Interceptor>) Collections.unmodifiableCollection(interceptors);
    }
}
