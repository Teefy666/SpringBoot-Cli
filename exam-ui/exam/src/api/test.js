import request from '@/api/request'

function demo(url, data) {
  return request({
    url: url,
    method: 'get',
    data: data
  })
}

export default {
  demo,
}
