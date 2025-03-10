// @ts-ignore
/* eslint-disable */
import request from '@/request'

/** health GET /api/test/health */
export async function healthUsingGet(options?: { [key: string]: any }) {
  return request<API.BaseResponseString_>('/api/test/health', {
    method: 'GET',
    ...(options || {}),
  })
}
