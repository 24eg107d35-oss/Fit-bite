import axios from 'axios';
export const api=axios.create({baseURL:import.meta.env.VITE_API_BASE_URL||'http://localhost:8080/api',timeout:120000});
api.interceptors.request.use(c=>{const t=localStorage.getItem('fitbite_token');if(t)c.headers.Authorization=`Bearer ${t}`;return c;});
api.interceptors.response.use(r=>r,e=>{if(e.response?.status===401){localStorage.removeItem('fitbite_token');localStorage.removeItem('fitbite_user');}return Promise.reject(e);});
export const unwrap=<T>(r:{data:{data:T}})=>r.data.data;
