
const result: number | "INTERNAL_SERVER_ERROR" = 1

function union<T>(result: T | "INTERNAL_SERVER_ERROR") {
  if(result === "INTERNAL_SERVER_ERROR") {
    throw new Error('Uh oh')
  } else {
    return result;
  }
}

union(result)